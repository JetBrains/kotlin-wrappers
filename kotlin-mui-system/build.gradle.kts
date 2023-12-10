plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinReactDom)

    jsMainApi(npmv("@mui/system"))
}
