package linter.classes;

public class DemoPrivateClass {
    
    private class InnerPrivateClass {

        private String name;

        public InnerPrivateClass(String name) {
            this.name = name;
        }


    }

    protected class InnerProtectedClass {

        public String name;

        public InnerProtectedClass(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

    }

    public InnerPrivateClass getInnerPrivateClass(String name) {
        return new InnerPrivateClass(name);
    }

}
