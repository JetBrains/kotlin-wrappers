plugins {
    `kotlin-legacy-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinJs)
    jsMainApi(projects.kotlinReactCore)
}
