plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinJs)

    jsMainApi(npmv("typescript"))
}
