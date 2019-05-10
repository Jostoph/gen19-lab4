package ch.heigvd.gen2019;

public enum Size {
    XS {
        @Override
        public String toString() {
            return "XS";
        }
    },
    S {
        @Override
        public String toString() {
            return "S";
        }
    },
    M {
        @Override
        public String toString() {
            return "M";
        }
    },
    L {
        @Override
        public String toString() {
            return "L";
        }
    },
    XL {
        @Override
        public String toString() {
            return "XL";
        }
    },
    XXL {
        @Override
        public String toString() {
            return "XXL";
        }
    },
    SIZE_NOT_APPLICABLE {
        @Override
        public String toString() {
            return "Invalid Size";
        }
    };

    public abstract String toString();
}