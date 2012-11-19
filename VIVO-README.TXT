vivosys repository: git://github.com/vivosys/swagger-core.git
URL https://github.com/vivosys/swagger-core

1. Add upstream repository

    git add upstream git@github.com:wordnik/swagger-core

2. Switch to the proper branch

    git checkout scala_2.10.0-rc1

3. The tests that are provided require that threading is not
   performed, otherwise the Jetty server ports will clash.

    REPO_ID=vivosys-repo
    REPO_URL=https://tools.vivosys.com/artifactory/ext-release-local
    mvn \
      -Dgpg.skip \
      -DaltDeploymentRepository=$REPO_ID::default::$REPO_URL \
      source:jar javadoc:jar deploy
