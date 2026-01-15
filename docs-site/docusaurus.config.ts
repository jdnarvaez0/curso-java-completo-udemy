import { themes as prismThemes } from 'prism-react-renderer';
import type { Config } from '@docusaurus/types';
import type * as Preset from '@docusaurus/preset-classic';

const config: Config = {
  title: 'Curso Java Completo',
  tagline: 'Master Completo Java de Cero a Experto',
  favicon: 'img/favicon.ico',

  future: {
    v4: true,
  },

  // URL se actualizará después del deploy a Vercel
  url: 'https://curso-java-docs.vercel.app',
  baseUrl: '/',

  organizationName: 'jdnarvaez0',
  projectName: 'curso-java-completo-udemy',

  onBrokenLinks: 'throw',

  i18n: {
    defaultLocale: 'es',
    locales: ['es'],
  },

  presets: [
    [
      'classic',
      {
        docs: {
          sidebarPath: './sidebars.ts',
          editUrl:
            'https://github.com/jdnarvaez0/curso-java-completo-udemy/tree/main/docs-site/',
        },
        blog: false, // Deshabilitamos el blog
        theme: {
          customCss: './src/css/custom.css',
        },
      } satisfies Preset.Options,
    ],
  ],

  themeConfig: {
    image: 'img/java-social-card.jpg',
    colorMode: {
      defaultMode: 'dark',
      respectPrefersColorScheme: true,
    },
    navbar: {
      title: 'Curso Java',
      logo: {
        alt: 'Java Logo',
        src: 'img/logo.svg',
      },
      items: [
        {
          type: 'docSidebar',
          sidebarId: 'tutorialSidebar',
          position: 'left',
          label: 'Documentación',
        },
        {
          href: 'https://github.com/jdnarvaez0/curso-java-completo-udemy',
          label: 'GitHub',
          position: 'right',
        },
      ],
    },
    footer: {
      style: 'dark',
      links: [
        {
          title: 'Documentación',
          items: [
            {
              label: 'Introducción',
              to: '/docs/intro',
            },
            {
              label: 'Variables',
              to: '/docs/variables',
            },
            {
              label: 'Strings',
              to: '/docs/strings',
            },
          ],
        },
        {
          title: 'Recursos',
          items: [
            {
              label: 'Curso en Udemy',
              href: 'https://www.udemy.com/',
            },
            {
              label: 'Repositorio GitHub',
              href: 'https://github.com/jdnarvaez0/curso-java-completo-udemy',
            },
          ],
        },
      ],
      copyright: `Copyright © ${new Date().getFullYear()} Curso Java Completo. Construido con Docusaurus.`,
    },
    prism: {
      theme: prismThemes.github,
      darkTheme: prismThemes.dracula,
      additionalLanguages: ['java'],
    },
  } satisfies Preset.ThemeConfig,
};

export default config;

