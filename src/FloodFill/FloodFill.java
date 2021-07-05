package FloodFill;

import java.util.ArrayList;

public interface FloodFill {
    void flood(final String map, final FloodLogger logger);

    static FloodFill getInstance() {
        FloodFill floodFill = new FloodFill() {
            @Override
            public void flood(String map, FloodLogger logger) {
                String result = "";
                logger.log(map);
                if (map.indexOf(LAND) == -1) {
                    return;
                }
                if (!map.contains("\n")) {
                    char[] simvs = new char[map.length()];
                    for (int i = 0; i < map.length(); i++) {
                        simvs[i] = map.charAt(i);
                    }
                    ArrayList<Integer> waterSimv = new ArrayList<>();
                    for (int i = 0; i < simvs.length; i++) {
                        if (simvs[i] == WATER) {
                            waterSimv.add(i);
                        }
                    }
                    for (int i = 0; i < waterSimv.size(); i++) {
                        int x = waterSimv.get(i);
                        if (x == 0) {
                            simvs[x + 1] = WATER;
                        }
                        if (x == simvs.length - 1) {
                            simvs[x - 1] = WATER;
                        }
                        if (x != 0 && x != simvs.length - 1) {
                            simvs[x + 1] = WATER;
                            simvs[x - 1] = WATER;
                        }
                    }
                    for (int i = 0; i < simvs.length; i++) {
                        result += simvs[i];
                    }
                } else {
                    String[] strings = map.split("\n");
                    //maximum string length for array size
                    int max = 0;
                    for (String s : strings) {
                        if (s.length() > max) {
                            max = s.length();
                        }
                    }
                    //splitting the strings into an array of characters
                    char[][] simv = new char[strings.length][max];
                    int i = 0;
                    for (String str : strings) {
                        for (int j = 0; j < max; j++) {
                            simv[i][j] = str.charAt(j);
                        }
                        i++;
                    }
                    ArrayList<Integer> waterCharIndex = new ArrayList<>();
                    for (int j = 0; j < strings.length; j++) {
                        for (int k = 0; k < max; k++) {
                            if (simv[j][k] == WATER) {
                                waterCharIndex.add(j);
                                waterCharIndex.add(k);
                            }
                        }
                    }
                    for (int j = 0; j < waterCharIndex.size() - 1; ) {
                        int y = waterCharIndex.get(j);
                        int x = waterCharIndex.get(++j);
                        if (y == 0 && x == 0) {
                            simv[y][x + 1] = WATER;
                            simv[y + 1][x] = WATER;
                        }
                        if (y == 0 && x != 0 && x != max - 1) {
                            simv[y][x - 1] = WATER;
                            simv[y][x + 1] = WATER;
                            simv[y + 1][x] = WATER;
                        }
                        if (y == 0 && x == max - 1) {
                            simv[y][x - 1] = WATER;
                            simv[y + 1][x] = WATER;
                        }
                        ////////////////////////////////////
                        if (y == strings.length - 1 && x == 0) {
                            simv[y][x + 1] = WATER;
                            simv[y - 1][x] = WATER;
                        }
                        if (y == strings.length - 1 && x != 0 && x != max - 1) {
                            simv[y][x - 1] = WATER;
                            simv[y][x + 1] = WATER;
                            simv[y - 1][x] = WATER;
                        }
                        if (y == strings.length - 1 && x == max - 1) {
                            simv[y][x - 1] = WATER;
                            simv[y - 1][x] = WATER;
                        }
                        ////////////////////////////////
                        if (y != 0 && y != strings.length - 1 && x == 0) {
                            simv[y + 1][x] = WATER;
                            simv[y][x + 1] = WATER;
                            simv[y - 1][x] = WATER;
                        }
                        if (y != 0 && y != strings.length - 1 && x == max - 1) {
                            simv[y + 1][x] = WATER;
                            simv[y][x - 1] = WATER;
                            simv[y - 1][x] = WATER;
                        }
                        if (y != 0 && y != strings.length - 1 && x != 0 && x != max - 1) {
                            simv[y + 1][x] = WATER;
                            simv[y - 1][x] = WATER;
                            simv[y][x + 1] = WATER;
                            simv[y][x - 1] = WATER;
                        }
                        j++;
                    }
                    for (int j = 0; j < strings.length; j++) {
                        for (int k = 0; k < max; k++) {
                            result += simv[j][k];
                        }
                        result += "\n";
                    }
                    result = result.substring(0, result.length() - 1);
                }
                //recursion
                if (!map.equals(result)) {
                    flood(result, logger);
                }
            }
        };
        return floodFill;
    }


    char LAND = '█';
    char WATER = '░';
}
