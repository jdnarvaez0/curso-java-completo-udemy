import type { SidebarsConfig } from '@docusaurus/plugin-content-docs';

const sidebars: SidebarsConfig = {
  tutorialSidebar: [
    {
      type: 'category',
      label: 'Introducción',
      collapsed: false,
      items: [
        'intro',
        'hola-mundo',
      ],
    },
    {
      type: 'category',
      label: 'Fundamentos',
      collapsed: false,
      items: [
        'variables',
        'strings',
        'operadores',
        'flujos-control',
        'wrapper',
        'valor-referencia',
      ],
    },
    {
      type: 'category',
      label: 'Bibliotecas',
      collapsed: false,
      items: [
        'date-calendar',
        'clase-system',
        'clase-math',
        'linea-comando',
      ],
    },
  ],
};

export default sidebars;
