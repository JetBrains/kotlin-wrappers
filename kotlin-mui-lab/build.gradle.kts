plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    jsMainApi(projects.kotlinMuiMaterial)
    jsMainApi(projects.kotlinMuixTreeView)

    commonMainApi(npm(jspkg.mui.lab))
}
