plugins {
    id("kotlin-library-conventions")
}

dependencies {
    commonMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinNode)
    commonMainApi(npm(libs.npm.vercel.ncc))
}
