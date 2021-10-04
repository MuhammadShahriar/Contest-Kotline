//In the name of ALLAH

import java.io.PrintWriter
import java.util.*
import kotlin.collections.ArrayDeque

val pw = PrintWriter(System.out)
fun main() {
    _writer.solve(); _writer.flush()
}

fun PrintWriter.solve() {
    var n = readInt();
    var a = IntArray(5);
    a = readAInt ( n );
    
    for (i in 0..n-1) println(a[i]);
}

@JvmField
val INPUT = System.`in`

@JvmField
val OUTPUT = System.out

@JvmField
val _reader = INPUT.bufferedReader()
fun readLine(): String? = _reader.readLine()
fun readLn() = _reader.readLine()!!

@JvmField
var _tokenizer: StringTokenizer = StringTokenizer("")
fun _read(): String {
    while (_tokenizer.hasMoreTokens().not()) _tokenizer = StringTokenizer(_reader.readLine() ?: return "", " ")
    return _tokenizer.nextToken()
}

fun readInt() = _read().toInt()
fun readDouble() = _read().toDouble()
fun readLong() = _read().toLong()
fun readString() = _read()
fun readVString(n: Int) = List(n) { _read() }
fun readLines(n: Int) = List(n) { readLn() }
fun readVInt(n: Int) = List(n) { _read().toInt() }
fun readAInt(n: Int) = IntArray(n) { _read().toInt() }
fun readVDouble(n: Int) = List(n) { _read().toDouble() }
fun readADouble(n: Int) = DoubleArray(n) { _read().toDouble() }
fun readVLong(n: Int) = List(n) { _read().toLong() }
fun readALong(n: Int) = LongArray(n) { _read().toLong() }
fun read(d: Int) = readInt() - d
fun read(d: Long) = readInt() - d
fun readV(n: Int, d: Int) = readVInt(n).map { x -> x - d }
fun readV(n: Int, d: Long) = readVLong(n).map { x -> x - d }
fun readA(n: Int, d: Int) = readAInt(n).map { x -> x - d }
fun readA(n: Int, d: Long) = readALong(n).map { x -> x - d }

@JvmField
val _writer = PrintWriter(OUTPUT, false)
inline fun output(block: PrintWriter.() -> Unit) {
    _writer.apply(block).flush()
}

