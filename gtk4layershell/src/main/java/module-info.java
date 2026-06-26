module org.gnome.gtk4layershell {
    requires static java.compiler;
    requires static org.jetbrains.annotations;
    requires transitive org.gnome.gtk;
    exports org.gnome.gtk4layershell;
}
