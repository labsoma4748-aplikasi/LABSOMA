import 'package:flutter/material.dart';

void main() {
  runApp(const AplikasiSaya());
}

class AplikasiSaya extends StatelessWidget {
  const AplikasiSaya({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      title: 'Aplikasi Shopee Style',
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.deepOrange),
        useMaterial3: true,
      ),
      home: const UtamaPage(),
    );
  }
}

class UtamaPage extends StatefulWidget {
  const UtamaPage({super.key});

  @override
  State<UtamaPage> createState() => _UtamaPageState();
}

class _UtamaPageState extends State<UtamaPage> {
  // Indeks untuk menentukan menu yang sedang aktif
  int _selectedIndex = 0;

  // Daftar halaman yang akan tampil sesuai menu di bawah
  final List<Widget> _pages = [
    const Center(child: Text('Halaman Beranda', style: TextStyle(fontSize: 20))),
    const Center(child: Text('Halaman Feed', style: TextStyle(fontSize: 20))),
    const Center(child: Text('Halaman Live', style: TextStyle(fontSize: 20))),
    const Center(child: Text('Halaman Notifikasi', style: TextStyle(fontSize: 20))),
    const Center(child: Text('Halaman Saya / Profil', style: TextStyle(fontSize: 20))),
  ];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Aplikasi Saya'),
        backgroundColor: Colors.deepOrange,
        foregroundColor: Colors.white,
      ),
      // Tampilan konten sesuai menu yang dipilih
      body: _pages[_selectedIndex],
      
      // MENU DI BAGIAN BAWAH (Bottom Navigation Bar)
      bottomNavigationBar: BottomNavigationBar(
        currentIndex: _selectedIndex,
        onTap: (int index) {
          setState(() {
            _selectedIndex = index; // Mengubah halaman aktif
          });
        },
        type: BottomNavigationBarType.fixed, // Menjaga semua menu tetap terlihat
        selectedItemColor: Colors.deepOrange, // Warna ikon yang sedang aktif
        unselectedItemColor: Colors.grey,     // Warna ikon yang tidak aktif
        items: const [
          BottomNavigationBarItem(
            icon: Icon(Icons.home),
            label: 'Beranda',
          ),
          BottomNavigationBarItem(
            icon: Icon(Icons.explore),
            label: 'Feed',
          ),
          BottomNavigationBarItem(
            icon: Icon(Icons.videocam),
            label: 'Live',
          ),
          BottomNavigationBarItem(
            icon: Icon(Icons.notifications),
            label: 'Notifikasi',
          ),
          BottomNavigationBarItem(
            icon: Icon(Icons.person),
            label: 'Saya',
          ),
        ],
      ),
    );
  }
}
