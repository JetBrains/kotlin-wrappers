plugins {
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(projects.kotlinReactDom)

    jsMainApi(npmv("@mui/system"))
}
