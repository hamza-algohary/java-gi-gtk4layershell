gen:
	./gir/java-gi-0.12.2/bin/java-gi gir/Gtk4LayerShell-1.0.gir --output . --domain org.gnome --project
download:
	-rm -rf tmp gir
	-mkdir tmp gir
# 	wget https://codeberg.org/java-gi/java-gi/releases/download/1.0.0-RC1/java-gi-1.0.0-RC1.zip -P tmp
# 	unzip tmp/java-gi-1.0.0-RC1.zip -d gir/

# 	wget https://github.com/jwharm/java-gi/releases/download/0.14.1/java-gi-0.14.1.zip -P tmp
# 	unzip tmp/java-gi-0.14.1.zip -d gir/

	wget https://github.com/jwharm/java-gi/releases/download/0.12.2/java-gi-0.12.2.zip -P tmp
	unzip tmp/java-gi-0.12.2.zip -d gir/

	wget http://cz.archive.ubuntu.com/ubuntu/pool/universe/g/gtk4-layer-shell/libgtk4-layer-shell-dev_1.3.0-1_amd64.deb -P tmp

	ar x tmp/libgtk4-layer-shell-dev_1.3.0-1_amd64.deb --output tmp
	unzstd tmp/data.tar.zst
	tar -xf tmp/data.tar -C tmp

	cp tmp/usr/share/gir-1.0/Gtk4LayerShell-1.0.gir gir/

	rm -rf tmp

clean:
	-rm -rf gtk4layershell gir

