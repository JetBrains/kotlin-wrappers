plugins {
    `kotlin-library-conventions`
}

dependencies {
    commonMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinNode)
    jsMainApi(npm(libs.npm.vercel.ncc))
}
