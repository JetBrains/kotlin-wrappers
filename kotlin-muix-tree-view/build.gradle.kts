plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    jsMainApi(projects.kotlinMuiMaterial)

    webMainApi(npm(jspkg.mui.xTreeView))
}
