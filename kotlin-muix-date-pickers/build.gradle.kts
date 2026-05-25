plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    webMainApi(projects.kotlinMuiMaterial)

    webMainApi(npm(jspkg.mui.xDatePickers))
}
