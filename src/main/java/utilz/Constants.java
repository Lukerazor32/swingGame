package utilz;

import main.GameThread;

public class Constants {
    public static final float GRAVITY = 0.08f * GameThread.SCALE;
    public static final int ANIMATIONSPEED = 10;

    public static class EnemyConstants {
        public static final int SYNTHETRON = 0;
        public static final int OMNICORE = 1;

        public static final int WAIT = 0;
        public static final int RUN = 1;
        public static final int ATTACK = 2;
        public static final int HIT = 3;
        public static final int DEAD = 4;

        public static final int ENEMY_WIDTH_DEFAULT = 64;
        public static final int ENEMY_HEIGHT_DEFAULT = 64;

        public static final int ENEMY_WIDTH = (int) (ENEMY_WIDTH_DEFAULT * GameThread.SCALE);
        public static final int ENEMY_HEIGHT = (int) (ENEMY_HEIGHT_DEFAULT * GameThread.SCALE);

        public static final int ENEMY_DRAWOFFSET_X = (int) (10 * GameThread.SCALE);
        public static final int ENEMY_DRAWOFFSET_Y = (int) (19 * GameThread.SCALE);

        public static int getSpriteAmount(int enemyType, int enemyState) {
            switch (enemyType) {
                case SYNTHETRON:
                    switch (enemyState) {
                        case WAIT:
                            return 8;
                        case RUN:
                            return 8;
                        case HIT:
                            return 6;
                        case DEAD:
                            return 7;
                        case ATTACK:
                            return 6;
                        default:
                            return 1;
                    }
            }
            return 0;
        }

        public static int getMaxHealth(int enemyType) {
            switch (enemyType) {
                case SYNTHETRON:
                    return  10;
                case OMNICORE:
                    return 200;
                default:
                    return 0;
            }
        }

        public static int getDamage(int enemyType) {
            switch (enemyType) {
                case SYNTHETRON:
                    return  10;
                case OMNICORE:
                    return 20;
                default:
                    return 0;
            }
        }
    }

    public static class ObjectConstants {
        public static final int EXP_INDEX = 0;
        public static final int HEALTH_INDEX = 1;
        public static final int HEALTH_VALUE = 10;

        public static final int OBJECT_WIDTH = (int) (GameThread.SCALE * 32);
        public static final int OBJECT_HEIGHT = (int) (GameThread.SCALE * 32);

        public static int getSpriteAmount(int objType) {
            switch (objType) {
                default:
                    return 6;
            }
        }
    }

    public static class BackgroundElements {
        public static final int MICROSHEME_WIDTH = (int) (300 * GameThread.SCALE);
        public static final int MICROSHEME_HEIGHT = (int) (300 * GameThread.SCALE);

        public static final int BUILDING_WIDTH = (int) (350 * GameThread.SCALE);
        public static final int BUILDING_HEIGHT = (int) (600 * GameThread.SCALE);

        public static final int BUILDING_TWO_WIDTH = (int) (600 * GameThread.SCALE);
        public static final int BUILDING_TWO_HEIGHT = (int) (400 * GameThread.SCALE);
    }

    public static class UI {
        public static class Buttons {
            public static final int B_WIDTH_DEFAULT = 300;
            public static final int B_HEIGHT_DEFAULT = 150;

            public static final int B_WIDTH = (int) (B_WIDTH_DEFAULT * GameThread.SCALE);
            public static final int B_HEIGHT = (int) (B_HEIGHT_DEFAULT * GameThread.SCALE);
        }

        public static class UrmButtons {
            public static final int URM_DEFAULT_SIZE = 100;
            public static final int URM_SIZE = (int) (URM_DEFAULT_SIZE * GameThread.SCALE);
        }
    }

    public static class Directions {
        public static final int RIGHT = 2;
        public static final int LEFT = 3;
    }

    public static class PlayerState {
        public static final int WAIT = 0;
        public static final int WALK = 1;
        public static final int RUN = 2;
        public static final int JUMP = 3;
        public static final int FALLING = 4;
        public static final int HIT = 5;
        public static final int ATTACK = 6;
        public static final int ATTACK_JUMP = 7;

        public static int getSpriteWidth(int action) {
            switch (action) {
                case WAIT:
                    return 4;
                case WALK:
                    return 4;
                case RUN:
                    return 4;
                case JUMP:
                    return 4;
                case FALLING:
                    return 1;
                case HIT:
                    return 7;
                case ATTACK:
                    return 6;
                case ATTACK_JUMP:
                    return 7;
                default:
                    return 1;
            }
        }
    }

}
