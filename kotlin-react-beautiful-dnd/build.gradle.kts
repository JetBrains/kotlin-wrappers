plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(project(":kotlin-react-core"))
    jsMainApi(project(":kotlin-react-dom"))

    jsMainApi(npmv("react-beautiful-dnd"))
}
