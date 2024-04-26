plugins {
    `kotlin-library-conventions`
    karakum()
}

dependencies {
    jsMainApi(projects.kotlinJs)

    jsMainApi(npmv("typescript"))
}
