///In the name of ALLAH

import java.lang.AssertionError
 
private fun readLn() = readLine()!! // string line
private fun readInt() = readLn().toInt() // single int
private fun readLong() = readLn().toLong() // single long
private fun readDouble() = readLn().toDouble() // single double
private fun readStrings() = readLn().split(" ") // list of strings
private fun readInts() = readStrings().map { it.toInt() } // list of ints
private fun readLongs() = readStrings().map { it.toLong() } // list of longs
private fun readDoubles() = readStrings().map { it.toDouble() } // list of doubles
 
private fun myAssert(x: Boolean) {
    if (!x) {
        throw AssertionError()
    }
}

fun main(args: Array<String>) {
    var a1 = readInt();
    var a2 = readInt();
    var k1 = readInt();
    var k2 = readInt();
    var n = readInt();

    var smA = 0;
    var smK = 0;
    var lgA = 0;
    var lgK = 0;

    if ( k1 < k2 ) {
        smA = a1;
        smK = k1;

        lgA = a2;
        lgK = k2;
    }
    else {
        smA = a2;
        smK = k2;

        lgA = a1;
        lgK = k1;
    }

    var smG = minOf ( smA, n / smK );
    var rem = n - ( smG * smK );

    var lgG = minOf ( lgA, rem / lgK );

    var ansMx = smG + lgG;

    n -= minOf ( n, ( ( a1 * (k1-1) ) + ( a2 * ( k2-1 ) ) ) );

    var ansMn = n;

    println("${ansMn} ${ansMx}");
}