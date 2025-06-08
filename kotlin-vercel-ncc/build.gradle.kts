plugins {
    id("wrappersbuild.kotlin-library-conventions")
}

dependencies {
    commonMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinNode)
    commonMainApi(npm(jspkg.vercel.ncc))
}
