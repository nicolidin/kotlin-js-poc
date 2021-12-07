@file:JsModule("../../../src/service/externalLib")
@file:JsNonModule

@OptIn(ExperimentalJsExport::class)
@JsName("getNode")
actual external fun getNode(id: String): NodeModel;
