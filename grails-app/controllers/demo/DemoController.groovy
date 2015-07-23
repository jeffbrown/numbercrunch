package demo

class DemoController {
    private static final NumberCrunch INSTANCE = new NumberCrunch('Robert Frip')

    def index() {
        render INSTANCE.name
    }
}
