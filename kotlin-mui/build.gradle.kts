plugins {
    kotlin("js")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-react-dom"))

    api(npmv("@mui/material"))
}
