plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

kotlin {
    sourceSets.webMain.dependencies {
        api(projects.kotlinJs)
        api(projects.kotlinNode)
        npm(jspkg.vercel.ncc)
    }
}
