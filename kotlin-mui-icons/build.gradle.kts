plugins {
    kotlin("js")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-mui"))

    api(npmv("@mui/icons-material"))
}
