plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(projects.kotlinReactCore)

    jsMainApi(npmv("@tanstack/react-query-devtools"))
}
