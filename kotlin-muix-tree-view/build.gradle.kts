plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    jsMainApi(projects.kotlinMuiMaterial)

    commonMainApi(npm(jspkg.mui.xTreeView))
}
