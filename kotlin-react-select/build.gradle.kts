plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(project(":kotlin-emotion"))
    jsMainApi(project(":kotlin-react"))
    jsMainApi(project(":kotlin-react-dom"))

    jsMainApi(npmv("react-select"))
}
