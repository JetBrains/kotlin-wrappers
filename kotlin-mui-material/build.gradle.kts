plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    jsMainApi(projects.kotlinMuiBase)

    commonMainApi(npm(jspkg.mui.material))
}
