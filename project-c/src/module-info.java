module project_c {
    requires transitive project_b;
    requires project_e;
    exports project_c.repo;
}