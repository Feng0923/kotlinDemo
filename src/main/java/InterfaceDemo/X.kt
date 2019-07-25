package InterfaceDemo

class X : A, B {
    override fun print() {
        println("X")
    }

    companion object {
        @JvmStatic
        fun getInstance(): X {
            return X()
        }
    }
}