plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinJs)

    jsMainApi(npmv("@tanstack/table-core"))
}
