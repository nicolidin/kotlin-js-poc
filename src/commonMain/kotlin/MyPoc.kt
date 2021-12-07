import kotlin.js.ExperimentalJsExport
import kotlin.js.JsExport
import kotlin.js.JsName

expect fun getNode(id: String): NodeModel

@ExperimentalJsExport
@JsExport
fun createNode(): NodeModel {
    var toto = getNode("1")
    toto.title = toto.title + " CHIENNNASSE"
    return toto
}
@ExperimentalJsExport
@JsName("MyPoc")
@JsExport
class MyPoc {
    var toto = 10;

    fun pute(): String {
        return "PUTE"
    }
}

@ExperimentalJsExport
@JsName("chiasse")
@JsExport
fun chiasse(): String {
    return "Titan"
}

@ExperimentalJsExport
@JsName("test")
@JsExport
fun test(toto: Array<String>): Array<String> {
    var totoList = toto.asList().toMutableList()
    totoList[0] += "chiennasse"
    totoList[1] += "chiennasse"

    return toto + totoList.toTypedArray()
}
@ExperimentalJsExport
@JsName("fuck")
@JsExport
fun fuck(yo: MyPoc): MyPoc{
    yo.toto = 1000
    return yo
}
@ExperimentalJsExport
@JsName("pocmap")
fun pocmap(toto: MutableMap<String, String>): MutableMap<String, String>{
    toto.map { it.value + "dqhqdhldlhhldhd" }
    return toto
}



@ExperimentalJsExport
@JsExport
fun toto(): String {
    return "dqdl"
}

@JsExport
class NodeModel(var id: String, var title: String) {}
