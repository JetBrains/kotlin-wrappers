plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinCsstype)
        api(projects.kotlinEmotionReact)
        api(projects.kotlinReact)

        npm(jspkg.emotion.styled)
    }
}
