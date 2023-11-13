package example

class Example {

    @Suppress("LongParameterList", "FunctionOnlyReturningConstant", "MagicNumber")
    fun methodWithLongParameterListAndOnlyReturningConstant(
        @SuppressWarnings("UnusedPrivateMember") a: Int,
        @SuppressWarnings("UnusedPrivateMember") b: Int,
        @SuppressWarnings("UnusedPrivateMember") c: Int,
        @SuppressWarnings("UnusedPrivateMember") d: Int,
        @SuppressWarnings("UnusedPrivateMember") e: Int,
        @SuppressWarnings("UnusedPrivateMember") f: Int,
    ): Int {
        return 123 + 987
    }

    @Suppress("LongParameterList", "UnusedPrivateMember", "MagicNumber", "MaxLineLength")
    fun anotherMethodWithLongParameterList(
        aa: String,
        bb: String,
        cc: String,
        dd: String,
        ee: String,
        ff: String,
    ): String {
        return aa + bb + 11 + "a very long sentence which makes this line way way way way way way way way way way way too long"
    }
}
