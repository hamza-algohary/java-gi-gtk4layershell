import org.jspecify.annotations.NullMarked;

@NullMarked module org.gnome.gtk4layershell {
    requires static java.compiler;
    requires transitive org.jspecify;
    exports org.gnome.gtk4layershell;
    requires transitive org.javagi.gtk;
}
