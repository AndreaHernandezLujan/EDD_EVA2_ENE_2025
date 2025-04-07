
package gestion_biblioteca;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Biblioteca extends JFrame implements ActionListener {
//
    
//MI CODIGO****************************************************************************
//    private JTextField txtTitulo;
//    private JTextField txtAutor;
//    private JTextArea txtAreaResultado;
//    private List<Libro> libros;
//
//    public Biblioteca() {
//        super("Biblioteca");
//
//        libros = new ArrayList<>();
//
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(600, 400); //Tamaño
//        setLayout(new BorderLayout());// Border
//        setResizable(false); //El usuario no podra redimensionar la interfaz
//        setLocationRelativeTo(null); //Para centrar en la pantalla
//
//        //panel de formulario para agregar los libros 
//        JPanel panelFormulario = new JPanel(new GridLayout(2, 2, 10, 10));
//        panelFormulario.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 10));
//
//        JLabel lblTitulo = new JLabel("Titulo: ");
//        lblTitulo.setFont(new Font("Arial", Font.BOLD, 16));
//        txtTitulo = new JTextField();
//        txtTitulo.setFont(new Font("Arial", Font.PLAIN, 16));
//
//        JLabel lblAutor = new JLabel("Autor: ");
//        lblAutor.setFont(new Font("Arial", Font.BOLD, 16));
//        txtAutor = new JTextField();
//        txtAutor.setFont(new Font("Arial", Font.PLAIN, 16));
//
//        panelFormulario.add(lblTitulo);
//        panelFormulario.add(txtTitulo);
//        panelFormulario.add(lblAutor);
//        panelFormulario.add(txtAutor);
//
//        //Botón añadir Libro
//        JButton btnAgregar = new JButton("Agregar");
//        btnAgregar.addActionListener(this);
//        btnAgregar.setFont(new Font("Arial", Font.BOLD, 16));
//        btnAgregar.setBackground(new Color(255, 102, 102));
//        btnAgregar.setForeground(Color.BLACK);
//        btnAgregar.setPreferredSize(new Dimension(200, 40));
//
//        //Botón Eliminar libro
//        JButton btnEliminar = new JButton("Eliminar");
//        btnEliminar.addActionListener(this);
//        btnEliminar.setFont(new Font("Arial", Font.BOLD, 16));
//        btnEliminar.setBackground(new Color(104, 204, 255));
//        btnEliminar.setForeground(Color.BLACK);
//        btnEliminar.setPreferredSize(new Dimension(200, 40));
//
//        //Botón Buscar Libro
//        JButton btnBuscar = new JButton("Buscar");
//        btnBuscar.addActionListener(this);
//        btnBuscar.setFont(new Font("Arial", Font.BOLD, 16));
//        btnBuscar.setBackground(new Color(255, 255, 102));
//        btnBuscar.setForeground(Color.BLACK);
//        btnBuscar.setPreferredSize(new Dimension(200, 40));
//
//        //Botón Inventario
//        JButton btnInventario = new JButton("Inventario");
//        btnInventario.addActionListener(this);
//        btnInventario.setFont(new Font("Arial", Font.BOLD, 16));
//        btnInventario.setBackground(new Color(153, 255, 153));
//        btnInventario.setForeground(Color.BLACK);
//        btnInventario.setPreferredSize(new Dimension(200, 40));
//
//        panelFormulario.add(btnAgregar);
//        panelFormulario.add(btnEliminar);
//        panelFormulario.add(btnBuscar);
//        panelFormulario.add(btnInventario);
//
//        //Área de resultados
//        txtAreaResultado = new JTextArea();
//        txtAreaResultado.setEditable(false);
//        txtAreaResultado.setFont(new Font("Arial", Font.PLAIN, 16));
//        txtAreaResultado.setLineWrap(true);
//        txtAreaResultado.setWrapStyleWord(true);
//        txtAreaResultado.setBackground(new Color(240, 240, 240));
//        txtAreaResultado.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
//        JScrollPane scrollPane = new JScrollPane(txtAreaResultado);
//        scrollPane.setPreferredSize(new Dimension(560, 200));
//
//        //Panel principal
//        JPanel panelPrincipal = new JPanel(new BorderLayout());
//        panelPrincipal.add(panelFormulario, BorderLayout.NORTH);
//        panelPrincipal.add(scrollPane, BorderLayout.SOUTH);
//        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
//
//        add(panelPrincipal);
//        setVisible(true);
//
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getActionCommand().equals("Agregar")) {
//            String titulo = txtTitulo.getText();
//            String Autor = txtAutor.getText();
//            if (!titulo.isEmpty() && !Autor.isEmpty()) {
//                agregarLibro(titulo, Autor);
//                txtTitulo.setText("");
//                txtAutor.setText("");
//                txtAreaResultado.setText("El libro se ha añadido corectamente a la biblioteca");
//            } else {
//                txtAreaResultado.setText("Por favor, introduce el titulo y el autor del libro");
//            }
//        } else if (e.getActionCommand().equals("Eliminar")) {
//            String titulo = txtTitulo.getText();
//            eliminarLibro(titulo);
//            txtTitulo.setText("");
//            txtAutor.setText("");
//            txtAreaResultado.setText("El libro ha sido eliminado correctamente de la biblioteca");
//
//        } else if (e.getActionCommand().equals("Buscar")) {
//            String terminoBusqueda = txtTitulo.getText();
//            String tipoBusqueda = "Titulo";
//            if (!terminoBusqueda.isEmpty()) {
//                List<String> resultados = buscarLibro(terminoBusqueda, tipoBusqueda);
//                txtAreaResultado.setText("");
//                if (resultados.isEmpty()) {
//                    txtAreaResultado.setText("No se encontraron libros con ese titulo" + terminoBusqueda + " .");
//
//                } else {
//                    for (String resultado : resultados) {
//                        txtAreaResultado.append(resultado + "\n");
//
//                    }
//                }
//            } else {
//                txtAreaResultado.setText("Por favor introduce un termino de busqueda");
//            }
//            txtTitulo.setText("");
//            txtAutor.setText("");
//        } else if (e.getActionCommand().equals("Inventario")) {
//            txtAreaResultado.setText("");
//            List<String> inventario = getInventario();
//            if (inventario.isEmpty()) {
//                txtAreaResultado.setText("La biblioteca esta vacia");
//            } else {
//                for (String libro : inventario) {
//                    txtAreaResultado.append(libro + "\n");
//
//                }
//            }
//            txtTitulo.setText("");
//            txtAutor.setText("");
//        }
//    }
//
//    public void agregarLibro(String titulo, String autor) {
//        Libro nuevoLibro = new Libro(titulo, autor);
//        libros.add(nuevoLibro); //El nuevo libro que hemos creado se guaradra en el Arraylist libros
//    }
//
//    public void eliminarLibro(String titulo) {
//        for (int i = 0; i < libros.size(); i++) {
//            Libro libro = libros.get(i);
//            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
//                libros.remove(i);
//                break;
//
//            }
//
//        }
//    }
//
//    public List<String> buscarLibro(String terminoBusqueda, String tipoBusqueda) {
//
//        List<String> resultados = new ArrayList<>();
//
//        for (Libro libro : libros) {
//
//            if (tipoBusqueda.equalsIgnoreCase("Titulo")) {
//                if (libro.getTitulo().equalsIgnoreCase(terminoBusqueda)) {
//                    resultados.add(libro.toString());
//                }
//            } else if (tipoBusqueda.equalsIgnoreCase("autor")) {
//                if (libro.getAutor().equalsIgnoreCase(terminoBusqueda)) {
//                    resultados.add(libro.toString());
//                }
//            }
//
//        }
//        return resultados;
//    }
//
//    public List<String> getInventario() {
//
//        List<String> inventario = new ArrayList<>();
//        for (Libro libro : libros) {
//            inventario.add(libro.toString());
//        }
//        return inventario;
//
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            try {
//                UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
//
//            } catch (IllegalAccessException ex) {
//                ex.printStackTrace();
//            } catch (ClassNotFoundException ex) {
//                Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (InstantiationException ex) {
//                Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
//            } catch (UnsupportedLookAndFeelException ex) {
//                Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            new Biblioteca();
//        });
//    
//
//
//    }
//}
    
    
    
//CODIGO NUEVO CON BUFFEREDREADER Y BUFFERERWRITER y FILEWRITER***************************************

//
//    private static final String ARCHIVO_BIBLIOTECA = "biblioteca.txt";
//    private JTextField txtTitulo;
//    private JTextField txtAutor;
//    private JTextArea txtAreaResultado;
//    private List<Libro> libros;
//
//    public Biblioteca() {
//        super("Biblioteca");
//
//        libros = new ArrayList<>();
//        cargarLibrosDesdeArchivo(); // Cargar libros al iniciar la aplicación
//
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(600, 400);
//        setLayout(new BorderLayout());
//        setResizable(false);
//        setLocationRelativeTo(null);
//
//        JPanel panelFormulario = new JPanel(new GridLayout(2, 2, 10, 10));
//        panelFormulario.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 10));
//
//        JLabel lblTitulo = new JLabel("Titulo: ");
//        lblTitulo.setFont(new Font("Arial", Font.BOLD, 16));
//        txtTitulo = new JTextField();
//        txtTitulo.setFont(new Font("Arial", Font.PLAIN, 16));
//
//        JLabel lblAutor = new JLabel("Autor: ");
//        lblAutor.setFont(new Font("Arial", Font.BOLD, 16));
//        txtAutor = new JTextField();
//        txtAutor.setFont(new Font("Arial", Font.PLAIN, 16));
//
//        panelFormulario.add(lblTitulo);
//        panelFormulario.add(txtTitulo);
//        panelFormulario.add(lblAutor);
//        panelFormulario.add(txtAutor);
//
//        JButton btnAgregar = new JButton("Agregar");
//        btnAgregar.addActionListener(this);
//        btnAgregar.setFont(new Font("Arial", Font.BOLD, 16));
//        btnAgregar.setBackground(new Color(255, 102, 102));
//        btnAgregar.setForeground(Color.BLACK);
//        btnAgregar.setPreferredSize(new Dimension(200, 40));
//
//        JButton btnEliminar = new JButton("Eliminar");
//        btnEliminar.addActionListener(this);
//        btnEliminar.setFont(new Font("Arial", Font.BOLD, 16));
//        btnEliminar.setBackground(new Color(104, 204, 255));
//        btnEliminar.setForeground(Color.BLACK);
//        btnEliminar.setPreferredSize(new Dimension(200, 40));
//
//        JButton btnBuscar = new JButton("Buscar");
//        btnBuscar.addActionListener(this);
//        btnBuscar.setFont(new Font("Arial", Font.BOLD, 16));
//        btnBuscar.setBackground(new Color(255, 255, 102));
//        btnBuscar.setForeground(Color.BLACK);
//        btnBuscar.setPreferredSize(new Dimension(200, 40));
//
//        JButton btnInventario = new JButton("Inventario");
//        btnInventario.addActionListener(this);
//        btnInventario.setFont(new Font("Arial", Font.BOLD, 16));
//        btnInventario.setBackground(new Color(153, 255, 153));
//        btnInventario.setForeground(Color.BLACK);
//        btnInventario.setPreferredSize(new Dimension(200, 40));
//
//        panelFormulario.add(btnAgregar);
//        panelFormulario.add(btnEliminar);
//        panelFormulario.add(btnBuscar);
//        panelFormulario.add(btnInventario);
//
//        txtAreaResultado = new JTextArea();
//        txtAreaResultado.setEditable(false);
//        txtAreaResultado.setFont(new Font("Arial", Font.PLAIN, 16));
//        txtAreaResultado.setLineWrap(true);
//        txtAreaResultado.setWrapStyleWord(true);
//        txtAreaResultado.setBackground(new Color(240, 240, 240));
//        txtAreaResultado.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
//        JScrollPane scrollPane = new JScrollPane(txtAreaResultado);
//        scrollPane.setPreferredSize(new Dimension(560, 200));
//
//        JPanel panelPrincipal = new JPanel(new BorderLayout());
//        panelPrincipal.add(panelFormulario, BorderLayout.NORTH);
//        panelPrincipal.add(scrollPane, BorderLayout.SOUTH);
//        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
//
//        add(panelPrincipal);
//        setVisible(true);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getActionCommand().equals("Agregar")) {
//            String titulo = txtTitulo.getText();
//            String autor = txtAutor.getText();
//            if (!titulo.isEmpty() && !autor.isEmpty()) {
//                agregarLibro(titulo, autor);
//                guardarLibrosEnArchivo();
//                txtTitulo.setText("");
//                txtAutor.setText("");
//                txtAreaResultado.setText("El libro se ha añadido correctamente a la biblioteca");
//            } else {
//                txtAreaResultado.setText("Por favor, introduce el título y el autor del libro");
//            }
//        } else if (e.getActionCommand().equals("Eliminar")) {
//            String titulo = txtTitulo.getText();
//            eliminarLibro(titulo);
//            guardarLibrosEnArchivo();
//            txtTitulo.setText("");
//            txtAutor.setText("");
//            txtAreaResultado.setText("El libro ha sido eliminado correctamente de la biblioteca");
//        } else if (e.getActionCommand().equals("Buscar")) {
//            String titulo = txtTitulo.getText();
//            if (!titulo.isEmpty()) {
//                buscarLibro(titulo);
//            } else {
//                txtAreaResultado.setText("Por favor, introduce el título del libro a buscar");
//            }
//        } else if (e.getActionCommand().equals("Inventario")) {
//            mostrarInventario();
//        }
//    }
//
//    public void agregarLibro(String titulo, String autor) {
//        libros.add(new Libro(titulo, autor));
//    }
//
//    public void eliminarLibro(String titulo) {
//        libros.removeIf(libro -> libro.getTitulo().equalsIgnoreCase(titulo));
//    }
//
//    public void buscarLibro(String titulo) {
//        for (Libro libro : libros) {
//            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
//                txtAreaResultado.setText("Libro encontrado: " + libro.getTitulo() + " de " + libro.getAutor());
//                return;
//            }
//        }
//        txtAreaResultado.setText("No se encontró el libro con el título: " + titulo);
//    }
//
//    public void mostrarInventario() {
//        if (libros.isEmpty()) {
//            txtAreaResultado.setText("No hay libros en la biblioteca.");
//        } else {
//            StringBuilder inventario = new StringBuilder("Inventario de la biblioteca:\n");
//            for (Libro libro : libros) {
//                inventario.append(libro.getTitulo()).append(" de ").append(libro.getAutor()).append("\n");
//            }
//            txtAreaResultado.setText(inventario.toString());
//        }
//    }
//
//    public void cargarLibrosDesdeArchivo() {
//        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO_BIBLIOTECA))) {
//            String linea;
//            while ((linea = br.readLine()) != null) {
//                String[] datos = linea.split(";");
//                if (datos.length == 2) {
//                    libros.add(new Libro(datos[0], datos[1]));
//                }
//            }
//        } catch (IOException e) {
//            System.out.println("No se pudo cargar la biblioteca: " + e.getMessage());
//        }
//    }
//
//    public void guardarLibrosEnArchivo() {
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO_BIBLIOTECA))) {
//            for (Libro libro : libros) {
//                bw.write(libro.getTitulo() + ";" + libro.getAutor());
//                bw.newLine();
//            }
//        } catch (IOException e) {
//            System.out.println("No se pudo guardar la biblioteca: " + e.getMessage());
//        }
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            try {
//                UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
//            } catch (Exception ex) {
//                Logger.getLogger(Biblioteca.class.getName()).log(Level.SEVERE, null, ex);
//            }
//            new Biblioteca();
//        });
//    }
//}
//**********************************************************************************************    
//CODIGO PRUEBA 3 SEGUNDA VENTANA CON JFRAME Y EL USO DE PILA STACK************************
// private static final String ARCHIVO_BIBLIOTECA = "biblioteca.txt";
//    private JTextField txtTitulo;
//    private JTextField txtAutor;
//    private JTextArea txtAreaResultado;
//    private List<Libro> libros;
//    private Stack<Libro> pilaPrestamos; // Pila para los libros prestados
//
//    public Biblioteca() {
//        super("Biblioteca");
//
//        libros = new ArrayList<>();
//        pilaPrestamos = new Stack<>(); // Inicializamos la pila de préstamos
//        cargarLibrosDesdeArchivo(); // Cargar libros al iniciar la aplicación
//
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(600, 400);
//        setLayout(new BorderLayout());
//        setResizable(false);
//        setLocationRelativeTo(null);
//
//        JPanel panelFormulario = new JPanel(new GridLayout(2, 2, 10, 10));
//        panelFormulario.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 10));
//
//        JLabel lblTitulo = new JLabel("Titulo: ");
//        lblTitulo.setFont(new Font("Arial", Font.BOLD, 16));
//        txtTitulo = new JTextField();
//        txtTitulo.setFont(new Font("Arial", Font.PLAIN, 16));
//
//        JLabel lblAutor = new JLabel("Autor: ");
//        lblAutor.setFont(new Font("Arial", Font.BOLD, 16));
//        txtAutor = new JTextField();
//        txtAutor.setFont(new Font("Arial", Font.PLAIN, 16));
//
//        panelFormulario.add(lblTitulo);
//        panelFormulario.add(txtTitulo);
//        panelFormulario.add(lblAutor);
//        panelFormulario.add(txtAutor);
//
//        JButton btnAgregar = new JButton("Agregar");
//        btnAgregar.addActionListener(this);
//        btnAgregar.setFont(new Font("Arial", Font.BOLD, 16));
//        btnAgregar.setBackground(new Color(255, 102, 102));
//        btnAgregar.setForeground(Color.BLACK);
//        btnAgregar.setPreferredSize(new Dimension(200, 40));
//
//        JButton btnEliminar = new JButton("Eliminar");
//        btnEliminar.addActionListener(this);
//        btnEliminar.setFont(new Font("Arial", Font.BOLD, 16));
//        btnEliminar.setBackground(new Color(104, 204, 255));
//        btnEliminar.setForeground(Color.BLACK);
//        btnEliminar.setPreferredSize(new Dimension(200, 40));
//
//        JButton btnBuscar = new JButton("Buscar");
//        btnBuscar.addActionListener(this);
//        btnBuscar.setFont(new Font("Arial", Font.BOLD, 16));
//        btnBuscar.setBackground(new Color(255, 255, 102));
//        btnBuscar.setForeground(Color.BLACK);
//        btnBuscar.setPreferredSize(new Dimension(200, 40));
//
//        JButton btnInventario = new JButton("Inventario");
//        btnInventario.addActionListener(this);
//        btnInventario.setFont(new Font("Arial", Font.BOLD, 16));
//        btnInventario.setBackground(new Color(153, 255, 153));
//        btnInventario.setForeground(Color.BLACK);
//        btnInventario.setPreferredSize(new Dimension(200, 40));
//
//        JButton btnPrestamo = new JButton("Realizar Préstamo");
//        btnPrestamo.addActionListener(this);
//        btnPrestamo.setFont(new Font("Arial", Font.BOLD, 16));
//        btnPrestamo.setBackground(new Color(255, 204, 0));
//        btnPrestamo.setForeground(Color.BLACK);
//        btnPrestamo.setPreferredSize(new Dimension(200, 40));
//
//        panelFormulario.add(btnAgregar);
//        panelFormulario.add(btnEliminar);
//        panelFormulario.add(btnBuscar);
//        panelFormulario.add(btnInventario);
//        panelFormulario.add(btnPrestamo); 
//
//        txtAreaResultado = new JTextArea();
//        txtAreaResultado.setEditable(false);
//        txtAreaResultado.setFont(new Font("Arial", Font.PLAIN, 16));
//        txtAreaResultado.setLineWrap(true);
//        txtAreaResultado.setWrapStyleWord(true);
//        txtAreaResultado.setBackground(new Color(240, 240, 240));
//        txtAreaResultado.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
//        JScrollPane scrollPane = new JScrollPane(txtAreaResultado);
//        scrollPane.setPreferredSize(new Dimension(560, 200));
//
//        JPanel panelPrincipal = new JPanel(new BorderLayout());
//        panelPrincipal.add(panelFormulario, BorderLayout.NORTH);
//        panelPrincipal.add(scrollPane, BorderLayout.SOUTH);
//        panelPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
//
//        add(panelPrincipal);
//        setVisible(true);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getActionCommand().equals("Agregar")) {
//            String titulo = txtTitulo.getText();
//            String autor = txtAutor.getText();
//            if (!titulo.isEmpty() && !autor.isEmpty()) {
//                agregarLibro(titulo, autor);
//                guardarLibrosEnArchivo();
//                txtTitulo.setText("");
//                txtAutor.setText("");
//                txtAreaResultado.setText("El libro se ha añadido correctamente a la biblioteca");
//            } else {
//                txtAreaResultado.setText("Por favor, introduce el título y el autor del libro");
//            }
//        } else if (e.getActionCommand().equals("Eliminar")) {
//            String titulo = txtTitulo.getText();
//            eliminarLibro(titulo);
//            guardarLibrosEnArchivo();
//            txtTitulo.setText("");
//            txtAutor.setText("");
//            txtAreaResultado.setText("El libro ha sido eliminado correctamente de la biblioteca");
//        } else if (e.getActionCommand().equals("Buscar")) {
//            String titulo = txtTitulo.getText();
//            if (!titulo.isEmpty()) {
//                buscarLibro(titulo);
//            } else {
//                txtAreaResultado.setText("Por favor, introduce el título del libro a buscar");
//            }
//        } else if (e.getActionCommand().equals("Inventario")) {
//            mostrarInventario();
//        } else if (e.getActionCommand().equals("Realizar Préstamo")) {
//            // Abrir ventana para realizar préstamo
//            new VentanaPrestamo(libros, pilaPrestamos);
//        }
//    }
//
//    public void agregarLibro(String titulo, String autor) {
//        libros.add(new Libro(titulo, autor));
//    }
//
//    public void eliminarLibro(String titulo) {
//        libros.removeIf(libro -> libro.getTitulo().equalsIgnoreCase(titulo));
//    }
//
//    public void buscarLibro(String titulo) {
//        for (Libro libro : libros) {
//            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
//                txtAreaResultado.setText("Libro encontrado: " + libro.getTitulo() + " de " + libro.getAutor());
//                return;
//            }
//        }
//        txtAreaResultado.setText("No se encontró el libro con el título: " + titulo);
//    }
//
//    public void mostrarInventario() {
//        if (libros.isEmpty()) {
//            txtAreaResultado.setText("No hay libros en la biblioteca.");
//        } else {
//            StringBuilder inventario = new StringBuilder("Inventario de la biblioteca:\n");
//            for (Libro libro : libros) {
//                inventario.append(libro.getTitulo()).append(" de ").append(libro.getAutor()).append("\n");
//            }
//            txtAreaResultado.setText(inventario.toString());
//        }
//    }
//
//    public void cargarLibrosDesdeArchivo() {
//        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO_BIBLIOTECA))) {
//            String linea;
//            while ((linea = br.readLine()) != null) {
//                String[] datos = linea.split(";");
//                if (datos.length == 2) {
//                    libros.add(new Libro(datos[0], datos[1]));
//                }
//            }
//        } catch (IOException e) {
//            System.out.println("No se pudo cargar la biblioteca: " + e.getMessage());
//        }
//    }
//
//    public void guardarLibrosEnArchivo() {
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO_BIBLIOTECA))) {
//            for (Libro libro : libros) {
//                bw.write(libro.getTitulo() + ";" + libro.getAutor());
//                bw.newLine();
//            }
//        } catch (IOException e) {
//            System.out.println("No se pudo guardar la biblioteca: " + e.getMessage());
//        }
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(() -> {
//            new Biblioteca();
//        });
//    }
//}
//
//class Libro {
//    private String titulo;
//    private String autor;
//
//    public Libro(String titulo, String autor) {
//        this.titulo = titulo;
//        this.autor = autor;
//    }
//
//    public String getTitulo() {
//        return titulo;
//    }
//
//    public String getAutor() {
//        return autor;
//    }
//}
//
//class VentanaPrestamo extends JFrame implements ActionListener {
//    private JTextField txtTitulo;
//    private JTextArea txtAreaResultado;
//    private List<Libro> libros;
//    private Stack<Libro> pilaPrestamos;
//
//    public VentanaPrestamo(List<Libro> libros, Stack<Libro> pilaPrestamos) {
//        super("Préstamos de Libros");
//
//        this.libros = libros;
//        this.pilaPrestamos = pilaPrestamos;
//
//        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        setSize(400, 300);
//        setLayout(new BorderLayout());
//        setResizable(false);
//        setLocationRelativeTo(null);
//
//        JPanel panelFormulario = new JPanel(new GridLayout(2, 2, 10, 10));
//        panelFormulario.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 10));
//
//        JLabel lblTitulo = new JLabel("Título del libro: ");
//        lblTitulo.setFont(new Font("Arial", Font.BOLD, 16));
//        txtTitulo = new JTextField();
//        txtTitulo.setFont(new Font("Arial", Font.PLAIN, 16));
//
//        panelFormulario.add(lblTitulo);
//        panelFormulario.add(txtTitulo);
//
//        JButton btnPrestar = new JButton("Prestar");
//        btnPrestar.addActionListener(this);
//        btnPrestar.setFont(new Font("Arial", Font.BOLD, 16));
//        btnPrestar.setBackground(new Color(0, 204, 255));
//        btnPrestar.setForeground(Color.BLACK);
//        btnPrestar.setPreferredSize(new Dimension(150, 40));
//
//        JButton btnDevolver = new JButton("Devolver");
//        btnDevolver.addActionListener(this);
//        btnDevolver.setFont(new Font("Arial", Font.BOLD, 16));
//        btnDevolver.setBackground(new Color(255, 102, 102));
//        btnDevolver.setForeground(Color.BLACK);
//        btnDevolver.setPreferredSize(new Dimension(150, 40));
//
//        panelFormulario.add(btnPrestar);
//        panelFormulario.add(btnDevolver);
//
//        txtAreaResultado = new JTextArea();
//        txtAreaResultado.setEditable(false);
//        txtAreaResultado.setFont(new Font("Arial", Font.PLAIN, 16));
//        txtAreaResultado.setLineWrap(true);
//        txtAreaResultado.setWrapStyleWord(true);
//        txtAreaResultado.setBackground(new Color(240, 240, 240));
//        txtAreaResultado.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
//        JScrollPane scrollPane = new JScrollPane(txtAreaResultado);
//        scrollPane.setPreferredSize(new Dimension(350, 100));
//
//        JPanel panelPrincipal = new JPanel(new BorderLayout());
//        panelPrincipal.add(panelFormulario, BorderLayout.NORTH);
//        panelPrincipal.add(scrollPane, BorderLayout.CENTER);
//
//        add(panelPrincipal);
//        setVisible(true);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        String titulo = txtTitulo.getText();
//        if (titulo.isEmpty()) {
//            txtAreaResultado.setText("Por favor, ingresa el título del libro.");
//            return;
//        }
//
//        if (e.getActionCommand().equals("Prestar")) {
//            prestamoLibro(titulo);
//        } else if (e.getActionCommand().equals("Devolver")) {
//            devolverLibro();
//        }
//    }
//
//    private void prestamoLibro(String titulo) {
//        for (Libro libro : libros) {
//            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
//                pilaPrestamos.push(libro); // Prestamos el libro agregándolo a la pila
//                txtAreaResultado.setText("Se ha prestado el libro: " + libro.getTitulo());
//                return;
//            }
//        }
//        txtAreaResultado.setText("El libro no está disponible.");
//    }
//
//    private void devolverLibro() {
//        if (!pilaPrestamos.isEmpty()) {
//            Libro libroDevuelto = pilaPrestamos.pop(); // Devolvemos el libro eliminándolo de la pila
//            txtAreaResultado.setText("Se ha devuelto el libro: " + libroDevuelto.getTitulo());
//        } else {
//            txtAreaResultado.setText("No hay libros prestados para devolver.");
//        }
//    }
//}

  
  //////////////////////////////////////////////////////////////////////////////////////////////////// 
  
///////////////////////////NUEVO///////////////////////////////////////////////////////////////////

//    private static final String ARCHIVO_BIBLIOTECA = "biblioteca.txt"; //SE DEFINE UN ARCHIVO EN DONDE SE GUARDARAN LOS LIBROS
//    private JTextField txtTitulo; //Campos de texto para ingresar título y autor del libro
//    private JTextField txtAutor;
//    private JTextArea txtAreaResultado;//Área de texto para mostrar resultados
//    private List<Libro> libros; //Lista de libros en la biblioteca
//    private Stack<Libro> pilaPrestamos;//Pila para registrar los préstamos de libros.
//    private Arbol1B arbolLibros;//Árbol binario de búsqueda para organizar libros por título
//
//    public Biblioteca() { //CONSTRUCTOR BIBLIOTECA
//        super("Biblioteca"); //Llama al constructor de JFrame para crear la ventana con título "Biblioteca"
//
//        libros = new ArrayList<>(); //Inicializa la lista de libros, la pila de préstamos y el árbol binario.
//        pilaPrestamos = new Stack<>();
//        arbolLibros = new Arbol1B();
//        cargarLibrosDesdeArchivo();  // Llama al método cargarLibrosDesdeArchivo(), que carga los libros desde el archivo biblioteca.txt
//        
//        //Se configura la ventana
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(600, 400);
//        setLayout(new BorderLayout());
//        setResizable(false);
//        setLocationRelativeTo(null);
//
//        //Crea un panel con un diseño de GridLayout(3,2) (3 filas, 2 columnas) con un espacio de 10 píxeles entre celdas
//        JPanel panelFormulario = new JPanel(new GridLayout(3, 2, 10, 10));
//        panelFormulario.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 10));
//
//        //Crea etiquetas y campos de texto para ingresar el título y autor del libro
//        JLabel lblTitulo = new JLabel("Titulo: ");
//        txtTitulo = new JTextField();
//        JLabel lblAutor = new JLabel("Autor: ");
//        txtAutor = new JTextField();
//
//        panelFormulario.add(lblTitulo); //Se agregan los componentes al panel en orden
//        panelFormulario.add(txtTitulo);
//        panelFormulario.add(lblAutor);
//        panelFormulario.add(txtAutor);
//
//        JButton btnAgregar = new JButton("Agregar");//Se crea el boton agregar
//        btnAgregar.addActionListener(this);
//        btnAgregar.setBackground(new Color(255, 102, 102));
//
//        JButton btnEliminar = new JButton("Eliminar"); //Se crea el boton eliminar
//        btnEliminar.addActionListener(this);
//        btnEliminar.setBackground(new Color(104, 204, 255));
//
//        JButton btnBuscar = new JButton("Buscar");//Se crea el boton buscar
//        btnBuscar.addActionListener(this);
//        btnBuscar.setBackground(new Color(255, 255, 102));
//
//        JButton btnInventario = new JButton("Inventario");//Se crea el boton inventario
//        btnInventario.addActionListener(this);
//        btnInventario.setBackground(new Color(153, 255, 153));
//
//        JButton btnPrestamo = new JButton("Realizar Préstamo"); //Se crea el boton prestamo
//        btnPrestamo.addActionListener(this);
//        btnPrestamo.setBackground(new Color(255, 204, 0));
//        
//        JButton btnMostrarArbol = new JButton("Mostrar Árbol"); //Se crea el boton buscar arbol
//        btnMostrarArbol.addActionListener(this);
//        btnMostrarArbol.setBackground(new Color(204, 153, 255));
//
//        panelFormulario.add(btnAgregar); //Se agregarn los botones al panel
//        panelFormulario.add(btnEliminar);
//        panelFormulario.add(btnBuscar);
//        panelFormulario.add(btnInventario);
//        panelFormulario.add(btnPrestamo);
//        panelFormulario.add(btnMostrarArbol);
//
//        txtAreaResultado = new JTextArea();//Se crea un area de texto para mostrar resultados
//        txtAreaResultado.setEditable(false);
//        JScrollPane scrollPane = new JScrollPane(txtAreaResultado);//Se le coloca una barra de desplazamiento
//
//        JPanel panelPrincipal = new JPanel(new BorderLayout()); //Se crea un panel principal
//        panelPrincipal.add(panelFormulario, BorderLayout.NORTH);//Coloca el panelFormulario en la parte superior (NORTH)
//        panelPrincipal.add(scrollPane, BorderLayout.CENTER);//Coloca el área de resultados en el centro (CENTER)
//
//        add(panelPrincipal); //Agrega el panel principal a la ventana y la hace visible
//        setVisible(true);
//    }
////************************************Manejo de Eventos****************************************************************
//    @Override
//    public void actionPerformed(ActionEvent e) { //Método que maneja los eventos de los botones
//        String comando = e.getActionCommand();
//        
//        if (comando.equals("Agregar")) { //Si el botón presionado es "Agregar"
//            String titulo = txtTitulo.getText();//Obtiene el título y autor ingresados
//            String autor = txtAutor.getText();//Si no están vacíos, llama agregarLibro(titulo, autor), muestra un mensaje y limpia los campos
//            if (!titulo.isEmpty() && !autor.isEmpty()) {
//                agregarLibro(titulo, autor);
//                txtAreaResultado.setText("Libro agregado correctamente");
//                limpiarCampos();  // Limpiar campos después de agregar el libro
//            } else {
//                txtAreaResultado.setText("Ingrese título y autor");
//            }
//        } else if (comando.equals("Eliminar")) {
//            eliminarLibro(txtTitulo.getText());
//            txtAreaResultado.setText("Libro eliminado correctamente");
//            limpiarCampos();  // Limpiar campos después de eliminar el libro
//        } else if (comando.equals("Buscar")) {
//            buscarLibro(txtTitulo.getText());
//        } else if (comando.equals("Inventario")) {
//            mostrarInventario();
//        } else if (comando.equals("Realizar Préstamo")) {
//            new VentanaPrestamo(libros, pilaPrestamos);
//        } else if (comando.equals("Mostrar Árbol")) {
//            txtAreaResultado.setText("Recorrido INORDEN:\n" + arbolLibros.inorder());
//        }
//    }
//
//    //**********************************Métodos de la Biblioteca****************************************************************
//    public void agregarLibro(String titulo, String autor) {
//        Libro libro = new Libro(titulo, autor); //Crea un objeto Libro y lo agrega a la lista y al árbol binario
//        libros.add(libro);
//        arbolLibros.add(titulo);
//    }
//
//    public void eliminarLibro(String titulo) { //Elimina un libro por título
//        libros.removeIf(libro -> libro.getTitulo().equalsIgnoreCase(titulo));
//    }
//
//    public void buscarLibro(String titulo) { //Busca un libro por título y muestra el resultado
//        for (Libro libro : libros) {
//            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
//                txtAreaResultado.setText("Libro encontrado: " + libro.getTitulo() + " de " + libro.getAutor());
//                return;
//            }
//        }
//        txtAreaResultado.setText("No encontrado");
//    }
//
//    public void mostrarInventario() { //Muestra todos los libros en el inventario
//        if (libros.isEmpty()) {
//            txtAreaResultado.setText("No hay libros");
//        } else {
//            StringBuilder inventario = new StringBuilder("Inventario:\n");
//            for (Libro libro : libros) {
//                inventario.append(libro.getTitulo()).append(" de ").append(libro.getAutor()).append("\n");
//            }
//            txtAreaResultado.setText(inventario.toString());
//        }
//    }
//
//    public void cargarLibrosDesdeArchivo() { //Carga libros desde el archivo biblioteca.txt
//        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO_BIBLIOTECA))) {
//            String linea;
//            while ((linea = br.readLine()) != null) {
//                String[] datos = linea.split(",");
//                if (datos.length == 2) {
//                    String titulo = datos[0].trim();
//                    String autor = datos[1].trim();
//                    agregarLibro(titulo, autor);
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void limpiarCampos() {
//        txtTitulo.setText("");  // Limpiar el campo de título
//        txtAutor.setText("");   // Limpiar el campo de autor
//    }
//
//   
//
//// Clase Libro: Representa un libro con título y autor
//class Libro {
//    private String titulo;
//    private String autor;
//
//    public Libro(String titulo, String autor) {
//        this.titulo = titulo;
//        this.autor = autor;
//    }
//
//    public String getTitulo() {
//        return titulo;
//    }
//
//    public String getAutor() {
//        return autor;
//    }
//}
////INORDEN (izquierda - raíz - derecha)
////Clase Arbol1B: Árbol binario de búsqueda para organizar los libros
//class Arbol1B {
//    private Nodo root; //root es la raíz del árbol, el primer nodo insertado
//    //El árbol crece añadiendo nodos a la izquierda o derecha de root
//    public void add(String titulo) { //Método público para insertar un nuevo título en el árbol
//        root = addRec(root, titulo); //Llama a addRec(), un método recursivo que inserta el nodo en la posición correcta
//    }
//
//    private Nodo addRec(Nodo actual, String titulo) {
//        if (actual == null) return new Nodo(titulo); //Si actual es null, significa que hemos encontrado la posición correcta, por lo que creamos un nuevo nodo con el título y lo devolvemos
//        if (titulo.compareTo(actual.titulo) < 0) { //Si titulo es menor al del nodo actual, lo insertamos en el subárbol izquierdo (actual.izquierda)
//            actual.izquierda = addRec(actual.izquierda, titulo);
//        } else {
//            actual.derecha = addRec(actual.derecha, titulo);//Si titulo es mayor, lo insertamos en el subárbol derecho (actual.derecha)
//
//
//        }
//        return actual;
//    }
//
//    public String inorder() { //Izquierda, raiz, derecha
//        StringBuilder sb = new StringBuilder(); //StringBuilder para almacenar el resultado
//        inorderRec(root, sb); //Llama a inorderRec() para recorrer el árbol
//        return sb.toString();
//    }
//
//    private void inorderRec(Nodo actual, StringBuilder sb) {
//        if (actual != null) { //Si actual no es null, primero recorre el subárbol izquierdo, luego visita la raíz y finalmente el subárbol derecho
//            inorderRec(actual.izquierda, sb);
//            sb.append(actual.titulo).append("\n");//Esto da como resultado una lista ordenada alfabéticamente de los títulos de los libros
//            inorderRec(actual.derecha, sb);
//        }
//    }
//}
//
//// Clase Nodo: Representa cada nodo del árbol
//class Nodo { //Cada nodo representa un libro en el arbol binario
//    String titulo; //titulo: el título del libro (clave del nodo)
//    Nodo izquierda, derecha;//referencia al subárbol izquierdo (para títulos menores)
//    //derecha: referencia al subárbol derecho (para títulos mayores)
//    public Nodo(String titulo) {
//        this.titulo = titulo;
//        izquierda = derecha = null;
//        //Cuando se crea un nuevo nodo, sus hijos (izquierda y derecha) son null
//    }
//}
//
//// Clase VentanaPrestamo
//class VentanaPrestamo extends JFrame {//Ventana para gestionar préstamos.
//    private List<Libro> libros;
//    private Stack<Libro> pilaPrestamos;
//
//    public VentanaPrestamo(List<Libro> libros, Stack<Libro> pilaPrestamos) {
//        this.libros = libros;
//        this.pilaPrestamos = pilaPrestamos;//Presta el primer libro disponible y lo mueve a la pila de préstamos.
//        
//        setTitle("Realizar Préstamo");
//        setSize(400, 300);
//        setLocationRelativeTo(null);
//        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//
//        setLayout(new BorderLayout());
//
//        JTextArea textArea = new JTextArea();
//        textArea.setEditable(false);
//        JScrollPane scrollPane = new JScrollPane(textArea);
//        add(scrollPane, BorderLayout.CENTER);
//
//        JButton btnPrestamo = new JButton("Realizar Préstamo");
//        btnPrestamo.addActionListener(e -> {
//            if (!libros.isEmpty()) {
//                Libro prestado = libros.get(0); // Realiza préstamo al primer libro
//                pilaPrestamos.push(prestado);  // Agrega a la pila de préstamos
//                libros.remove(0); // Elimina del inventario
//                textArea.setText("Libro prestado: " + prestado.getTitulo() + " de " + prestado.getAutor());
//            } else {
//                textArea.setText("No hay libros disponibles.");
//            }
//        });
//        add(btnPrestamo, BorderLayout.SOUTH);
//
//        setVisible(true);
//    }
//}
//}


    private static final String ARCHIVO_BIBLIOTECA = "biblioteca.txt";

    private JTextField txtTitulo;
    private JTextField txtAutor;
    private JTextArea txtAreaResultado;
    private List<Libro> libros;
    private Stack<Libro> pilaPrestamos;
    private Arbol1B arbolLibros;

    public Biblioteca() {
        super("Biblioteca");

        libros = new ArrayList<>();
        pilaPrestamos = new Stack<>();
        arbolLibros = new Arbol1B();
        cargarLibrosDesdeArchivo();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLayout(new BorderLayout());
        setResizable(false);
        setLocationRelativeTo(null);

        JPanel panelFormulario = new JPanel(new GridLayout(3, 2, 10, 10));
        panelFormulario.setBorder(BorderFactory.createEmptyBorder(20, 20, 10, 10));

        JLabel lblTitulo = new JLabel("Titulo: ");
        txtTitulo = new JTextField();
        JLabel lblAutor = new JLabel("Autor: ");
        txtAutor = new JTextField();

        panelFormulario.add(lblTitulo);
        panelFormulario.add(txtTitulo);
        panelFormulario.add(lblAutor);
        panelFormulario.add(txtAutor);

        JButton btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(this);
        btnAgregar.setBackground(new Color(255, 102, 102));

        JButton btnEliminar = new JButton("Eliminar");
        btnEliminar.addActionListener(this);
        btnEliminar.setBackground(new Color(104, 204, 255));

        JButton btnBuscar = new JButton("Buscar");
        btnBuscar.addActionListener(this);
        btnBuscar.setBackground(new Color(255, 255, 102));

        JButton btnInventario = new JButton("Inventario");
        btnInventario.addActionListener(this);
        btnInventario.setBackground(new Color(153, 255, 153));

        JButton btnPrestamo = new JButton("Realizar Préstamo");
        btnPrestamo.addActionListener(this);
        btnPrestamo.setBackground(new Color(255, 204, 0));

        JButton btnMostrarArbol = new JButton("Mostrar Árbol");
        btnMostrarArbol.addActionListener(this);
        btnMostrarArbol.setBackground(new Color(204, 153, 255));

        panelFormulario.add(btnAgregar);
        panelFormulario.add(btnEliminar);
        panelFormulario.add(btnBuscar);
        panelFormulario.add(btnInventario);
        panelFormulario.add(btnPrestamo);
        panelFormulario.add(btnMostrarArbol);

        txtAreaResultado = new JTextArea();
        txtAreaResultado.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtAreaResultado);

        JPanel panelPrincipal = new JPanel(new BorderLayout());
        panelPrincipal.add(panelFormulario, BorderLayout.NORTH);
        panelPrincipal.add(scrollPane, BorderLayout.CENTER);

        add(panelPrincipal);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        if (comando.equals("Agregar")) {
            String titulo = txtTitulo.getText();
            String autor = txtAutor.getText();
            if (!titulo.isEmpty() && !autor.isEmpty()) {
                agregarLibro(titulo, autor);
                guardarLibrosEnArchivo(); // Guarda cambios
                txtAreaResultado.setText("Libro agregado correctamente");
                limpiarCampos();
            } else {
                txtAreaResultado.setText("Ingrese título y autor");
            }
        } else if (comando.equals("Eliminar")) {
            eliminarLibro(txtTitulo.getText());
            guardarLibrosEnArchivo(); // Guarda cambios
            txtAreaResultado.setText("Libro eliminado correctamente");
            limpiarCampos();
        } else if (comando.equals("Buscar")) {
            buscarLibro(txtTitulo.getText());
        } else if (comando.equals("Inventario")) {
            mostrarInventario();
        } else if (comando.equals("Realizar Préstamo")) {
            new VentanaPrestamo(libros, pilaPrestamos);
        } else if (comando.equals("Mostrar Árbol")) {
            txtAreaResultado.setText("Recorrido INORDEN:\n" + arbolLibros.inorder());
        }
    }

    public void agregarLibro(String titulo, String autor) {
        Libro libro = new Libro(titulo, autor);
        libros.add(libro);
        arbolLibros.add(titulo);
    }

    public void eliminarLibro(String titulo) {
        libros.removeIf(libro -> libro.getTitulo().equalsIgnoreCase(titulo));
    }

    public void buscarLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                txtAreaResultado.setText("Libro encontrado: " + libro.getTitulo() + " de " + libro.getAutor());
                return;
            }
        }
        txtAreaResultado.setText("No encontrado");
    }

    public void mostrarInventario() {
        if (libros.isEmpty()) {
            txtAreaResultado.setText("No hay libros");
        } else {
            StringBuilder inventario = new StringBuilder("Inventario:\n");
            for (Libro libro : libros) {
                inventario.append(libro.getTitulo()).append(" de ").append(libro.getAutor()).append("\n");
            }
            txtAreaResultado.setText(inventario.toString());
        }
    }

    public void cargarLibrosDesdeArchivo() {
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO_BIBLIOTECA))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos.length == 2) {
                    String titulo = datos[0].trim();
                    String autor = datos[1].trim();
                    agregarLibro(titulo, autor);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void guardarLibrosEnArchivo() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO_BIBLIOTECA))) {
            for (Libro libro : libros) {
                bw.write(libro.getTitulo() + "," + libro.getAutor());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void limpiarCampos() {
        txtTitulo.setText("");
        txtAutor.setText("");
    }

    // Clase Libro
    class Libro {
        private String titulo;
        private String autor;

        public Libro(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }
    }

    // Clase Arbol1B
    class Arbol1B {
        private Nodo root;

        public void add(String titulo) {
            root = addRec(root, titulo);
        }

        private Nodo addRec(Nodo actual, String titulo) {
            if (actual == null) return new Nodo(titulo);
            if (titulo.compareTo(actual.titulo) < 0) {
                actual.izquierda = addRec(actual.izquierda, titulo);
            } else {
                actual.derecha = addRec(actual.derecha, titulo);
            }
            return actual;
        }

        public String inorder() {
            StringBuilder sb = new StringBuilder();
            inorderRec(root, sb);
            return sb.toString();
        }

        private void inorderRec(Nodo actual, StringBuilder sb) {
            if (actual != null) {
                inorderRec(actual.izquierda, sb);
                sb.append(actual.titulo).append("\n");
                inorderRec(actual.derecha, sb);
            }
        }
    }

    // Clase Nodo
    class Nodo {
        String titulo;
        Nodo izquierda, derecha;

        public Nodo(String titulo) {
            this.titulo = titulo;
            izquierda = derecha = null;
        }
    }

    // Clase VentanaPrestamo
    class VentanaPrestamo extends JFrame {
        private List<Libro> libros;
        private Stack<Libro> pilaPrestamos;

        public VentanaPrestamo(List<Libro> libros, Stack<Libro> pilaPrestamos) {
            this.libros = libros;
            this.pilaPrestamos = pilaPrestamos;

            setTitle("Realizar Préstamo");
            setSize(400, 300);
            setLocationRelativeTo(null);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setLayout(new BorderLayout());

            JTextArea textArea = new JTextArea();
            textArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(textArea);
            add(scrollPane, BorderLayout.CENTER);

            JButton btnPrestamo = new JButton("Realizar Préstamo");
            btnPrestamo.addActionListener(e -> {
                if (!libros.isEmpty()) {
                    Libro prestado = libros.get(0);
                    pilaPrestamos.push(prestado);
                    libros.remove(0);
                    textArea.setText("Libro prestado: " + prestado.getTitulo() + " de " + prestado.getAutor());

                    // Guardar después de préstamo
                    try (BufferedWriter bw = new BufferedWriter(new FileWriter(ARCHIVO_BIBLIOTECA))) {
                        for (Libro libro : libros) {
                            bw.write(libro.getTitulo() + "," + libro.getAutor());
                            bw.newLine();
                        }
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

                } else {
                    textArea.setText("No hay libros disponibles.");
                }
            });

            add(btnPrestamo, BorderLayout.SOUTH);
            setVisible(true);
        }

}
    }



   



   
   










    
    
    
    

