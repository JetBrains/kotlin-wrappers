import NpmDependencyStrategy.EXACT

plugins {
    `kotlin-library-conventions`
}

dependencies {
    jsMainApi(projects.kotlinMuiMaterial)

    jsMainApi(npmv("@mui/x-tree-view", EXACT))
}
