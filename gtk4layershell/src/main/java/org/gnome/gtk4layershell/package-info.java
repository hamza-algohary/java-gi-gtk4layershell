/**
 * Java bindings for org.gnome.gtk4layershell.
 * <p>
 * The following native libraries are required and will be loaded: {@code libgtk4-layer-shell.so}
 * <p>
 * For namespace-global declarations, refer to the {@link Gtk4LayerShell} class documentation.
 * <p>
 * This package is only available on linux.
 * 
 * <h2>Gtk4-layer-shell</h2>
 * <a href="https://wayland.app/protocols/wlr-layer-shell-unstable-v1">Layer Shell</a>
 * is a Wayland protocol for desktop shell components,
 * such as panels, notifications and wallpapers. You can use it to anchor
 * your windows to a corner or edge of the output, or stretch them across
 * the entire output. This library aims to support all Layer Shell features,
 * and supports GTK popups and popovers.
 * <p>
 * This library only functions on Wayland compositors that the support Layer Shell.
 * __It does not work on X11 or GNOME on Wayland.__
 * <p>
 * <strong>Note On Linking</strong><br/>
 * If you link against libwayland you must link this library before libwayland. See
 * <a href="https://github.com/wmww/gtk4-layer-shell/blob/main/linking.md">linking.md</a> for details.
 * <p>
 * <strong>Setting Window Size</strong><br/>
 * If you wish to force your layer surface window to be a different size than it
 * is by default:
 * <pre>{@code   gtk_window_set_default_size(layer_gtk_window, width, height);
 * }</pre>
 * If width or height is 0, the default is used for that axis. If the window is
 * anchored to opposite edges of the output(see gtk_layer_set_anchor()), the
 * size requested here is ignored. If you later wish to use the default window size
 * repeat the call with both width and height as 0. Setting to 1, 1 is sometimes useful
 * to keep the window the smallest it can be while still fitting its contents.
 */
package org.gnome.gtk4layershell;
