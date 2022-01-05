plugins {
    kotlin("js")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    api(project(":kotlin-react-dom"))
    api(project(":kotlin-popper"))

    api(npmv("@mui/material"))
    api(npmv("@mui/lab"))
}
