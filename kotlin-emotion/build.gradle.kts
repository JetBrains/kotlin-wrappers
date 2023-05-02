plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(project(":kotlin-csstype"))
    jsMainApi(project(":kotlin-browser"))
    jsMainApi(project(":kotlin-react-core"))

    jsMainApi(npmv("@emotion/cache"))
    jsMainApi(npmv("@emotion/css"))
    jsMainApi(npmv("@emotion/react"))
    jsMainApi(npmv("@emotion/styled"))
}
