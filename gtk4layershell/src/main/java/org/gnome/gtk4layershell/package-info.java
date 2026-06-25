///
/// Java bindings for org.gnome.gtk4layershell.
///
/// The following native libraries are required and will be loaded:`libgtk4-layer-shell.so`
///
/// For namespace-global declarations, refer to the {@link Gtk4LayerShell} class documentation.
 ///
 /// This package is only available on linux.
/// 
/// ## Gtk4-layer-shell
/// [Layer Shell](https://wayland.app/protocols/wlr-layer-shell-unstable-v1)
/// is a Wayland protocol for desktop shell components,
/// such as panels, notifications and wallpapers. You can use it to anchor
/// your windows to a corner or edge of the output, or stretch them across
/// the entire output. This library aims to support all Layer Shell features,
/// and supports GTK popups and popovers.
/// 
/// This library only functions on Wayland compositors that the support Layer Shell.
/// __It does not work on X11 or GNOME on Wayland.__
/// 
/// # Note On Linking
/// If you link against libwayland you must link this library before libwayland. See
/// [linking.md](https://github.com/wmww/gtk4-layer-shell/blob/main/linking.md) for details.
/// 
/// # Setting Window Size
/// If you wish to force your layer surface window to be a different size than it
/// is by default:
/// ```C
///   gtk_window_set_default_size(layer_gtk_window, width, height);
/// ```
/// If width or height is 0, the default is used for that axis. If the window is
/// anchored to opposite edges of the output(see gtk_layer_set_anchor()), the
/// size requested here is ignored. If you later wish to use the default window size
/// repeat the call with both width and height as 0. Setting to 1, 1 is sometimes useful
/// to keep the window the smallest it can be while still fitting its contents.
///
package org.gnome.gtk4layershell;
