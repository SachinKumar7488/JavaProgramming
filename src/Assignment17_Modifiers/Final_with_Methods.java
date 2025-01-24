package Assignment17_Modifiers;

    // superclass with a final method
    class Base {
        // final method
        public final void show() {
            System.out.println("This is the final method in the Base class.");
        }
    }

    // subclass to override final method
    class Derived extends Base {
    /*
    @Override
    public void show() {
        System.out.println("Attempting to override the final method in the Derived class.");
    }
    */
    }

    class FinalMethodExample {
        public static void main(String[] args) {
            // instance of the derived class
            Derived obj = new Derived();

            // calling the show() method
            obj.show();
        }
    }
