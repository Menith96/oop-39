module project_b {
    requires project_a;
    exports project_b.service;
    exports project_b.util;
}