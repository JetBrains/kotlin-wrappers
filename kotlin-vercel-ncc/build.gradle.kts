plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinNode)
    jsMainApi(npm(libs.npm.vercel.ncc))
}
