---
sidebar_position: 8
---

# 🔗 Paso por Valor vs Referencia

En Java, todo se pasa por valor, pero hay diferencias entre primitivos y objetos.

## Tipos Primitivos: Por Valor

Se copia el **valor** de la variable. Modificar la copia no afecta el original.

```java
public static void modificar(int numero) {
    numero = 100; // Modifica la copia
}

public static void main(String[] args) {
    int x = 5;
    modificar(x);
    System.out.println(x); // 5 (no cambió)
}
```

## Tipos Referenciados: Referencia por Valor

Se copia la **referencia** al objeto. Ambas referencias apuntan al mismo objeto.

```java
public static void modificar(int[] arreglo) {
    arreglo[0] = 100; // Modifica el objeto original
}

public static void main(String[] args) {
    int[] nums = {1, 2, 3};
    modificar(nums);
    System.out.println(nums[0]); // 100 (cambió)
}
```

## Diagrama Visual

```
Primitivos:
┌─────┐    ┌─────┐
│  x  │ →  │ 5   │  (valor)
└─────┘    └─────┘

Referencias:
┌─────┐    ┌──────────┐
│ ref │ →  │ {1,2,3}  │  (objeto en heap)
└─────┘    └──────────┘
     ↑
┌─────┐
│copy │ →  (misma dirección)
└─────┘
```

## Reasignar vs Modificar

```java
// Reasignar la referencia NO afecta el original
public static void reasignar(int[] arr) {
    arr = new int[]{100, 200}; // Nueva referencia
}

int[] nums = {1, 2, 3};
reasignar(nums);
System.out.println(nums[0]); // 1 (no cambió)

// Modificar el contenido SÍ afecta el original
public static void modificar(int[] arr) {
    arr[0] = 100; // Modifica el objeto
}

modificar(nums);
System.out.println(nums[0]); // 100 (cambió)
```

:::tip Resumen
- **Primitivos**: Se copia el valor, original no cambia
- **Referencias**: Se copia la referencia, modificar el objeto afecta el original
- **Reasignar**: Crear nuevo objeto no afecta el original
:::
