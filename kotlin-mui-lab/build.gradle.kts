plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinMuiMaterial)
    webMainApi(projects.kotlinMuixTreeView)

    webMainApi(npm(jspkg.mui.lab))
}
