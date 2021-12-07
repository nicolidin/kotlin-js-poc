//getNodewill call singleton servide gave by the back that will call redis (implementing interface)
actual fun getNode(id: String): NodeModel {
    return NodeModel("2", "title2")
}