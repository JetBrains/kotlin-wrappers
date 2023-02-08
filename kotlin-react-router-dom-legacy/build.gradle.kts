plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(project(":kotlin-history"))
    jsMainApi(project(":kotlin-react-dom"))

    jsMainApi(npm("react-router-dom", "^6.3.0"))
}
