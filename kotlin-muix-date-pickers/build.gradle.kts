plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinMuiMaterial)

        npm(jspkg.mui.xDatePickers)
    }
}
